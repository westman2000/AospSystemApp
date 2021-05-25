# AospSystemApp
Add application to aosp emulator system image



PRODUCT_PACKAGES += VelocityApp

added in build/target/product/mainline_system.mk

Option #1
- BroadcastReceiver will receive BOOT_COMPLETE event -> dump shell output

Option #2
- As persistent application, it will be started on system boot, VelocityApp.onCreate() -> dump shell output


TODO:
- support direct boot mode
- support shell dump when screen is locked
