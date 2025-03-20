def call() {
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/master]],  
        userRemoteConfigs: [[
            url: 'https://github.com/Bharathdev07/springpetclinic--project.git',
            credentialsId: 'github-tokken'
        ]]
    ])
}
