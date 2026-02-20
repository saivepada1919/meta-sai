DESCRIPTION = "bb file for subtaction using make files"
LICENSE = "CLOSED"
SRC_URI = "file://subtraction.c \
	   file://Makefile"
S = "${WORKDIR}"
do_compile(){
	oe_runmake
}
do_install(){
        install -d ${D}/usr/bin
        install -m 777 ${S}/sub ${D}/usr/bin
}


