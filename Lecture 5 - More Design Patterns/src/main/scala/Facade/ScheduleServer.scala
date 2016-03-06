package Facade

trait ScheduleServer {
  
  def startBooting
  def readSystemConfigFile
  def init
  def initializeContext
  def initializeListeners
  def createSystemObjects
  def releaseProcesses
  def destroy
  def destroySystemObjects
  def destoryListeners
  def destoryContext
  def shutdown

}

class ScheduleServerFacade(ss : ScheduleServer) {
  
  def start = {
    ss.startBooting
    ss.readSystemConfigFile
    ss.init
    ss.initializeContext
    ss.initializeListeners
    ss.createSystemObjects
    println("Start working . . .")
    println("After work done . . .")
  }
  
  def stop = {
    ss.releaseProcesses
    ss.destroy
    ss.destroySystemObjects
    ss.destoryListeners
    ss.destoryContext
    ss.shutdown
  }
  
}