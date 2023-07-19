package template

abstract class Task (
    private val auditTrail: AuditTrail
){

    abstract fun doExecute()

    fun execute() {
        auditTrail.record()

        doExecute()
    }
}