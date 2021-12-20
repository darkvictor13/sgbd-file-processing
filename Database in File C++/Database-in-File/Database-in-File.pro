QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

CONFIG += c++11

# You can make your code fail to compile if it uses deprecated APIs.
# In order to do so, uncomment the following line.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
    database.cpp \
    insert_dialog.cpp \
    remove_dialog.cpp \
    select_dialog.cpp \
    student.cpp \
    main.cpp \
    main_window.cpp

HEADERS += \
    database.hpp \
    insert_dialog.h \
    remove_dialog.h \
    select_dialog.h \
    student.hpp \
    main_window.h

FORMS += \
    insert_dialog.ui \
    main_window.ui \
    remove_dialog.ui \
    select_dialog.ui

TRANSLATIONS += \
    Database-in-File_en_US.ts
CONFIG += lrelease
CONFIG += embed_translations

# Default rules for deployment.
qnx: target.path = /tmp/$${TARGET}/bin
else: unix:!android: target.path = /opt/$${TARGET}/bin
!isEmpty(target.path): INSTALLS += target
