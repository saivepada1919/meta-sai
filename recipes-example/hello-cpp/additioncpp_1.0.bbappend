FILESEXTRAPATHS:prepend :="${THISDIR}/files/:"


SRC_URI:append = " file://hello.c"


do_compile:append(){
	${CC} ${LDFLAGS} hello.c -o hello
}

do_install:append(){
	install -m 777 ${S}/hello ${D}/usr/bin

}

PACKAGES += "additioncpp-cpp additioncpp-c"

FILES_additioncpp-cpp ="/usr/bin/add"
FILES_additioncpp-c ="/usr/bin/hello"
