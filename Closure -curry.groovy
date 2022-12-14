def log = { String type, Date created0n, String msg ->

println "$created0n [$type] - $msg"
}

log ("DEBUG",new Date(),"Something went wrong here..")

def debugLog = log.curry("DEBUG")
debugLog(new Date(),"Bad day in the office")
debugLog(new Date(),"This is one more")



