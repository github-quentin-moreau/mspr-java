pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo 'Java version =>'
                sh 'java --version'
                sh 'java -jar ./dist/start_mspr_java.jar'
            }
        }
    }
}
