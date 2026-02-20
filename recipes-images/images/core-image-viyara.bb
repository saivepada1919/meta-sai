DESCRIPTION= "rootfs image for viayara boards"
require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " \
	libmodbus \
	additioncpp \
"
