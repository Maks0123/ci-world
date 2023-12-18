java.lang.reflect.Method method;
/* Stage for package chart
 */
def UnitTetst(String project, String stageName='') {
    stage(stageName ? stageName : 'UnitTetsts') {
        println('UnnitTetst... ')
        comm = "sleep 10"
        sh(comm)

    }
}

