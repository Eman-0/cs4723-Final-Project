pipeline {

  agent any
  
  stages {
    stage('Build') {
      steps {
        echo 'Starting Build'
        sh 'mvn -B -DskipTests clean package'
      }
    }  
    stage('Test') {
      steps {
        echo 'Starting test'
        sh 'mvn test'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Beginning to deploy'
        echo 'mio'
      }
    }
  }
}
