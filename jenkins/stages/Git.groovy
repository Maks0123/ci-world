/* Stage for git clone
 */
def GitClone(String project, String stageName='') {
    stage(stageName ? stageName : 'Git clone') {
            String comm
            println('Git clone... ')
            comm = "git clone https://github.com/Maks0123/${project}.git"
            sh(comm)
    }
}