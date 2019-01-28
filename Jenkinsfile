#!groovy

// This file tells Jenkins how to build the project. More info is here: https://confluence.sbb.ch/pages/viewpage.action?pageId=854620436
// Typically you would define an organizational scan so that Jenkins finds this file and executes it.

pipeline {
    agent { label 'java' }
    tools {
        maven 'Apache Maven 3.5'
        jdk 'OpenJDK 1.8 64-Bit'
    }

    stages {
        stage('feature branches and PR') {
            when {
                not { anyOf { branch 'master'; branch 'develop' } }
            }
            steps {
                bin_mvnBuildScan(
                        targetRepo: "yourArtifactoryRepo.mvn",
                        additionalMavenGoals: "",
                        deployArtifacts: false,
                        scanBuild: false)
            }
        }

        stage('develop') {
            when {
                anyOf { branch 'develop' }
            }
            steps {
                bin_mvnBuildScan(
                        targetRepo: "yourArtifactoryRepo.mvn",
                        additionalMavenGoals: "",
                        deployArtifacts: true,
                        scanBuild: true,
                        failBuild: false)
                cloud_buildDockerImageSelfRunningJar(artifactoryProject: "yourArtifactoryRepo.docker", port: "8080", tag: "latest")
            }
        }

        stage('master') {
            when {
                anyOf { branch 'master' }
            }
            steps {
                script {
                    def releasedPom = bin_releaseMvn(
                            targetRepo: 'yourArtifactoryRepo.mvn',
                            additionalMavenGoals: ""
                    )
                    cloud_buildDockerImageSelfRunningJar(artifactoryProject: "yourArtifactoryRepo.docker", port: "8080", pomVersion: releasedPom.version)
                }
            }
        }
    }
}
