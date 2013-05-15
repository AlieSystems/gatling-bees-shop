
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BeesShopSimulation extends Simulation {

  val httpConf = httpConfig.baseURL("http://bees-shop.clardeur.cloudbees.net")

  setUp(
    ConsultProductsScenario.scn.inject(ramp(3 users) over (5 seconds)).protocolConfig(httpConf)
    //SearchProductsScenario.scn.inject(ramp(200 users) over (100 seconds)).protocolConfig(httpConf)
    //BuyProductsScenario.scn.inject(atOnce(1 users)).protocolConfig(httpConf)
  )
}