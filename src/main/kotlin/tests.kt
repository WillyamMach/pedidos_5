fun main() {
    val customer = Customer("Roger")

    customer.SetRegisterInfo("89312-000", 432, "Sbs", "SC")
    print(customer.userRegister())
}
