import com.corp.project.mgmt.libs.*


/* Stage for build project
 */
def BuildProject(String project, String stageName='') {
    stage(stageName ? stageName : 'Build') {
        String comm
        comm = '''mvn clean \\
                 |mvn package'''.stripMargin()
        println('Build project... ')
        sh(comm)
        }
    }
}