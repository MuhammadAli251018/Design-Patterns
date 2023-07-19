package template

class TransformMoneyTask (private val auditTrail: AuditTrail) : Task (auditTrail) {

    override fun doExecute() {
        println("Money transited")
    }
}