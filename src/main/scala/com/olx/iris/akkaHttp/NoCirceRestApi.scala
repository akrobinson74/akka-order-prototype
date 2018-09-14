package com.olx.iris.akkaHttp
import akka.http.scaladsl.server.{Directives, Route}
import com.olx.iris.JsonMappings

trait NoCirceRestApi extends Directives with JsonMappings {
  def route: Route
}
