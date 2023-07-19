package template

class GenerateReport(private val auditTrail: AuditTrail) : Task(auditTrail) {

    override fun doExecute() {
        println("generated report")
    }
}