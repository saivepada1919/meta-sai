DESCRIPTION = "bb file for library"
LICENSE = "CLOSED"
SRC_URI = "file://test.h \
	   file://test.c"
S = "${WORKDIR}"
do_compile(){
	${CC} ${LDFLAGS} -c -fPIC test.c -o test.o
	${CC} ${LDFLAGS} -shared -o libtest.so.1 test.o
}
do_install(){
	install -d ${D}/usr/lib
	install -m 777 ${S}/libtest.so.1 ${D}/usr/lib
}
