import hudson.model.Job
import jenkins.model.Jenkins


def call() {
    println("global command called")
    Job j = Jenkins.getInstance().getItemByFullName("");
    println("Last build date: ${j.getLastBuild().getTimestamp().format("yyyy-MM-dd")}");
}
