interface Wifi {
    var connected: Boolean
    val cardname: String

    fun connect()

    fun print() {
        println("Connected?: $connected")
    }
}

abstract class Computer(speed: Double, ram: Int, graphics: String) {
    val speed: Double = speed
    val ram: Int = ram
    val graphics: String = graphics

    open fun print() {
        println("-------------------------")
        println("Speed: $speed")
        println("Ram: $ram")
        println("Graphics Card: $graphics")
    }

    abstract fun turnOn()
}

class SmartSensor() : Wifi {
    override var connected: Boolean = true
    override val cardname: String = "Wifi 1000"

    override fun connect() {
        return
    }

    fun beep() {
        println("beep")
    }

}

class Laptop(speed: Double, ram: Int, graphics: String, screen: Double) : Computer(speed, ram, graphics), Wifi {
    val screen: Double = screen
    override var connected: Boolean = false
    override val cardname: String = "Wifi"

    override fun connect() {
        connected = true
    }

    override fun print() {
        super<Computer>.print()
        println("Screensize: $screen")
        super<Wifi>.print()
    }

    override fun turnOn() {
        println("Open")
        println("Press button")
    }
}

class Desktop(speed: Double, ram: Int, graphics: String, lights: Boolean) : Computer(speed, ram, graphics) {
    val lights: Boolean = lights

    override fun print() {
        super.print()
        println("Lights: $lights")
    }

    override fun turnOn() {
        println("Connect to power")
        println("Press button")
    }
}

class Aktenkoffer() {
    lateinit var laptop: Laptop

    fun insertLaptop(l: Laptop) {
        laptop = l
    }

    fun pullOutLatop(): Laptop? {
        return if (this::laptop.isInitialized) {
            laptop
        } else null
    }
}

fun Aktenkoffer.generateLaptop(): Laptop {
    return Laptop(1.1, 2, "Intel HD 2000", 15.6)
}

fun main(args: Array<String>) {
    val sensor = SmartSensor()
    val desktop = Desktop(4.2, 32, "GTX 1080", true)
    val laptop = Laptop(2.1, 8, "Intel HD 3000", 15.6)

    val koffer: Aktenkoffer = Aktenkoffer()
    koffer.insertLaptop(laptop)
    koffer.pullOutLatop()?.print()
    koffer.generateLaptop().print()

    val computers: Array<Computer> = arrayOf(desktop, laptop)
    for (computer in computers) {
        // computer.print()
        // computer.turnOn()
    }

    val wifiDevices: Array<Wifi> = arrayOf(sensor, laptop)
    for (device in wifiDevices) {
        // device.connect()
    }

    val sensor2: Wifi = sensor
    if (sensor2 is SmartSensor) {
        // sensor2.beep()
    }

    val unsafeSensor: SmartSensor? = sensor2 as? SmartSensor
    // unsafeSensor?.beep();
}