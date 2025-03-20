def call() {
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/master']], // Fix: Properly close brackets and quotes
        userRemoteConfigs: [[
            credentialsId: 'github-tokken', 
            url: 'https://github.com/Bharathdev07/springpetclinic--project.git'
        ]]
    ])
}
