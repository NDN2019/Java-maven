pipeline{
    agent any

    stages{
        stage('build'){
			
			steps{
				bat 'mvn -B clean package -DskipTests '
			 }
        }
    }

}