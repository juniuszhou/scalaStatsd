import com.timgroup.statsd.NonBlockingStatsDClient

/**
 * Created by junius on 8/21/15.
 */
object SimpleTry {
  def main (args: Array[String]) {
    val prefix = "lpas-trends"
    val hostname = "127.0.0.1"
    val port = 8125
    val client = new NonBlockingStatsDClient(prefix, hostname, port)

    client.count("count", 0)

    (0 to 10).foreach( i => client.increment("count"))

    (0 to 10).foreach( i => client.incrementCounter("count_two"))

    (0 to 10).foreach( i => client.recordGaugeValue("count_three", 100))

    //(0 to 10).foreach( i => client.increment("count"))


  }
}
