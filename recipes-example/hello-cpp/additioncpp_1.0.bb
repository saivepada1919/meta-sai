DESCRIPTION = "bb file for addtion in cpp"
LICENSE = "CLOSED"
SRC_URI = "file://addition.cpp"
S = "${WORKDIR}"
do_compile(){
	cd ${S}
	${CXX} ${LDFLAGS} addition.cpp -o add
}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/add ${D}/usr/bin
}
