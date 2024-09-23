class Customer(name: String) {
    private var userName: String = ""
    private var postalCode: String = ""
    private var buildingNumber: Int = 0
    private var city: String = ""
    private var state: String = ""

    init {
        this.userName = name
    }

    fun getUsername(): String {
        return this.userName
    }

    fun SetRegisterInfo(postalCode: String, buildingNumber: Int, city: String, state: String) {
        this.postalCode = postalCode
        this.buildingNumber = buildingNumber
        this.city = city
        this.state = state
    }

    fun userRegister(): Int {
        if(!verifyIfPostalCodeIsValid(this.postalCode)) {
            return 400
        }

        return 201
    }

    fun verifyIfPostalCodeIsValid(postalCode: String): Boolean {
        val charQuantity = postalCode.count()
        val postalCodeFormat = postalCode.matches(Regex("\\d{5}-\\d{3}"))

        if(charQuantity < 8 || charQuantity > 9 || !postalCodeFormat) {
            return false
        }

        return true
    }

}

