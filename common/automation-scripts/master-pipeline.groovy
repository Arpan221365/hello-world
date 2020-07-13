node('master'){
	try{
		def plObj={}
		plObj.nodeOs = isUnix() ? 'LINUX' : 'WIN'
		println "The Node is - "+ plObj.nodeOs
	}catch(Exception e){
		throw e
	}finally{
		deleteDir()
	}
}