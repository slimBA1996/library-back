pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install package'
      }
    }

  }
}