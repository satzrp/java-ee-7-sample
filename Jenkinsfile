pipeline {
   agent any
   tools {
        maven 'MAVEN'
        jdk 'JAVA1.8'
    }
   stages {
      stage('Prepare') {
         steps {
            echo 'Pull code from Git'
            git 'https://github.com/LordOfSati/java-ee-7-sample.git/'
         }
      }
      stage('Build') {
         steps {
            echo 'Build Code'
            sh 'mvn clean install'
         }
      }
      stage('Sonar Scanner') {
            environment {
                scannerHome = tool 'LocalSonarScanner'
            }    
            steps {
                withSonarQubeEnv('LocalSonarQube') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }
        stage('Sonar - Quality Gate') {
            steps {
                timeout(time: 10, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        stage('Deploy') {
            when {
                expression {
                    GIT_BRANCH = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
                    echo GIT_BRANCH
                    return GIT_BRANCH == 'master'
                }
            }
            steps {
                echo 'Master Branch - so deploying'
            }
        }
   }
}
