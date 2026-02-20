DESCRIPTION="recipe .bb for hello c exmaple"
LICENSE="CLOSED"
SRC_URI="file://hello.c"

S="${WORKDIR}"

do_compile(){
	cd ${S}
	${CC} ${LDFLAGS} hello.c -o hello
}

do_install(){
	install -d ${D}${bindir}
	install -m 777  ${S}/hello ${D}${bindir}

}
