DESCRIPTION = "bb file for autotools"
LICENSE = "CLOSED"
SRC_URI = "file://hiii.c \ 
	   file://Makefile.am \
	   file://configure.ac"
S = "${WORKDIR}"
do_compile(){
 	autoreconf --install
	./configure --host=arm-poky-linux-gnueabi
	make
}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/hii ${D}/usr/bin
}

