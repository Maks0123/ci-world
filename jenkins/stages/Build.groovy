import com.corp.project.mgmt.libs.*


/* Stage for build project
 */
def BuildProject(String project, String stageName='') {
    stage(stageName ? stageName : 'Build') {
        dir(project) {
            String comm

            switch(project) {
                case 'helloworld1':
                    comm = '''mvn clean \\
                             |mvn package'''.stripMargin()
                    break
                case 'helloworld2':
                    comm = '''mvn clean \\
                             |mvn package'''.stripMargin()
                    break
                default:
                    comm = '''mvn clean \\
                             |mvn package'''.stripMargin()
                    break
            }

            println('Build project... ')
            sh(comm)
        }
    }
}