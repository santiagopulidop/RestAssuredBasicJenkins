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
                "git clone https://github.com/santiagopulidop/RestAssuredBasicJenkins"
            }
        }
        stage("Build"){
            steps{
                "mvn clean install"
            }
        }
        stage("Test"){
            steps{
                "mvn test"
            }

        }
    }
}
