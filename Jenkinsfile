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
                sh '${WORKSPACE}/ChildModule1/gradlew -p ${WORKSPACE}/ChildModule1 clean build'
            }
        }
        stage('check2') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Child 2') {
            steps {
                sh '${WORKSPACE}/ChildModule2/gradlew -p ${WORKSPACE}/ChildModule2 clean build'
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
