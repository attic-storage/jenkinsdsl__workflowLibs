package jenkinsdsl

def checkOutFrom(repo) {
  git url: "http://github.com/rlespinasse/jenkinsdsl__${repo}.git".toString()
}

