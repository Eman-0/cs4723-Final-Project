pipeline {

  agent {
    docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
    }
  }
  
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
