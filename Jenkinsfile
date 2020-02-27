pipeline{
    agent any

    stages{
        stage('build'){
			
			steps{
				bat 'mvn -B DiskTests clean package'
			 }
        }
    }

}