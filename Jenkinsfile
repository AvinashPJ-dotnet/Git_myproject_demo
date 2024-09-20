pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''echo"hello  build"
'''
      }
    }

    stage('test') {
      parallel {
        stage('test') {
          steps {
            sh 'echo"test"'
          }
        }

        stage('deploy') {
          steps {
            sh 'echo"deployed"'
          }
        }

      }
    }

    stage('deploypodr') {
      steps {
        sh 'echo"deploy prod"'
      }
    }

  }
}