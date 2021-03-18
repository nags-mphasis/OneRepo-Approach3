pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('check1') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Child 1') {
            steps {
                sh './gradlew -p ${WORKSPACE}/ChildModule1 clean build'
                cucumber buildStatus: 'UNSTABLE',
                    reportTitle: 'Child 1',
                    fileIncludePattern: '**/ChildModule1.json'
            }
        }
        stage('check2') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Child 2') {
            steps {
                sh './gradlew -p ${WORKSPACE}/ChildModule2 clean build'
                cucumber buildStatus: 'UNSTABLE',
                    reportTitle: 'Child 2',
                    fileIncludePattern: '**/ChildModule2.json'
            }
        }
        stage('check3') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
