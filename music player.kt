class MusicPlayer {
    private var songs: Array<String> = arrayOf()
    //your code goes here
    var track = 0
    var check = 0
    fun add(name: String){
        songs += name
        track++
    }

    fun show(){
        while(check < track){
            print(songs[check] + "\n")
            check++
        }
    }

    fun play(){
        print("Playing " +  songs[0])
    }
}
fun main(args: Array<String>) {
    val m = MusicPlayer()
    
    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}
