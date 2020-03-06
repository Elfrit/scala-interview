package com.particeep.test.akka

import akka.actor.{ Actor, ActorSystem, Props }

/**
 * Question about Akka framework http://akka.io
 *
 * When receiving a message that says "Hello", BasicActor must print "Hello there."
 * It must print "What?" when receiving any other message
 */
class BasicActor {}

object FireActor {
   
  val log = Logging(context.system, this)

  def receive = {
    case "test" => log.info("Hello there.")
    case _      => log.info("What ?")
  }
  
  /**
    * Create an instance of BasicActor
    *
    * Make it print "Hello there." and "What?"
    */
  def fireActor(): Unit = {
        val system = ActorSystem("Actor System")
        val basic_actor = system.actorOf(Props[BasicActor], name = "basic actor")
  }
}
