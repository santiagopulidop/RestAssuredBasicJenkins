pipeline{
    agent any
    stages{
        stage("Clean up"){
            steps{
                deletDir()
            }
        }
        stage("Clone Repo"){
            steps{
               sh "git clone https://github.com/santiagopulidop/RestAssuredBasicJenkins"
            }
        }
        stage("Build"){
            steps{
               sh "mvn clean install"
            }
        }
        stage("Test"){
            steps{
               sh "mvn test"
            }

        }
    }
}
