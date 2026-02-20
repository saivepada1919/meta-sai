DESCRIPTION = "bb file for cmake"
LICENSE = "CLOSED"
SRC_URI = "file://divison.c \
	   file://CMakeLists.txt"
S = "${WORKDIR}"
inherit cmake

