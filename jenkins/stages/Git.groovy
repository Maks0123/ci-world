import com.corp.project.mgmt.libs.*


/* Stage for git clone
 */
def BuildImage(String project, String stageName='') {
    stage(stageName ? stageName : 'Git clone') {
        dir(project) {
            String comm
            println('Git clone... ')

            comm = "git clone https://github.com/Maks0123/${project}.git"
            sh(comm)
        }
    }
}