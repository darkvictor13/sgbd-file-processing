/********************************************************************************
** Form generated from reading UI file 'remove_dialog.ui'
**
** Created by: Qt User Interface Compiler version 5.15.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_REMOVE_DIALOG_H
#define UI_REMOVE_DIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QDialog>
#include <QtWidgets/QDialogButtonBox>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QSpacerItem>
#include <QtWidgets/QVBoxLayout>

QT_BEGIN_NAMESPACE

class Ui_RemoveDialog
{
public:
    QGridLayout *gridLayout;
    QVBoxLayout *verticalLayout;
    QSpacerItem *verticalSpacer_3;
    QHBoxLayout *removeHorizontalLayout;
    QLabel *removeLabel;
    QSpacerItem *verticalSpacer_2;
    QHBoxLayout *horizontalLayout;
    QLabel *label;
    QLineEdit *lineEdit;
    QSpacerItem *verticalSpacer;
    QDialogButtonBox *buttonBox;

    void setupUi(QDialog *RemoveDialog)
    {
        if (RemoveDialog->objectName().isEmpty())
            RemoveDialog->setObjectName(QString::fromUtf8("RemoveDialog"));
        RemoveDialog->resize(400, 183);
        gridLayout = new QGridLayout(RemoveDialog);
        gridLayout->setObjectName(QString::fromUtf8("gridLayout"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        verticalSpacer_3 = new QSpacerItem(20, 40, QSizePolicy::Minimum, QSizePolicy::Expanding);

        verticalLayout->addItem(verticalSpacer_3);

        removeHorizontalLayout = new QHBoxLayout();
        removeHorizontalLayout->setObjectName(QString::fromUtf8("removeHorizontalLayout"));
        removeLabel = new QLabel(RemoveDialog);
        removeLabel->setObjectName(QString::fromUtf8("removeLabel"));
        QFont font;
        font.setPointSize(12);
        font.setBold(true);
        removeLabel->setFont(font);
        removeLabel->setAlignment(Qt::AlignCenter);

        removeHorizontalLayout->addWidget(removeLabel);


        verticalLayout->addLayout(removeHorizontalLayout);

        verticalSpacer_2 = new QSpacerItem(20, 40, QSizePolicy::Minimum, QSizePolicy::Expanding);

        verticalLayout->addItem(verticalSpacer_2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(9, -1, 9, -1);
        label = new QLabel(RemoveDialog);
        label->setObjectName(QString::fromUtf8("label"));
        label->setAlignment(Qt::AlignCenter);

        horizontalLayout->addWidget(label);

        lineEdit = new QLineEdit(RemoveDialog);
        lineEdit->setObjectName(QString::fromUtf8("lineEdit"));

        horizontalLayout->addWidget(lineEdit);

        horizontalLayout->setStretch(0, 1);
        horizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(horizontalLayout);

        verticalSpacer = new QSpacerItem(20, 40, QSizePolicy::Minimum, QSizePolicy::Expanding);

        verticalLayout->addItem(verticalSpacer);


        gridLayout->addLayout(verticalLayout, 0, 0, 1, 1);

        buttonBox = new QDialogButtonBox(RemoveDialog);
        buttonBox->setObjectName(QString::fromUtf8("buttonBox"));
        buttonBox->setOrientation(Qt::Horizontal);
        buttonBox->setStandardButtons(QDialogButtonBox::Cancel|QDialogButtonBox::Ok);

        gridLayout->addWidget(buttonBox, 1, 0, 1, 1);


        retranslateUi(RemoveDialog);
        QObject::connect(buttonBox, SIGNAL(accepted()), RemoveDialog, SLOT(accept()));
        QObject::connect(buttonBox, SIGNAL(rejected()), RemoveDialog, SLOT(reject()));

        QMetaObject::connectSlotsByName(RemoveDialog);
    } // setupUi

    void retranslateUi(QDialog *RemoveDialog)
    {
        RemoveDialog->setWindowTitle(QCoreApplication::translate("RemoveDialog", "Dialog", nullptr));
        removeLabel->setText(QCoreApplication::translate("RemoveDialog", "Remove", nullptr));
        label->setText(QCoreApplication::translate("RemoveDialog", "Id", nullptr));
    } // retranslateUi

};

namespace Ui {
    class RemoveDialog: public Ui_RemoveDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_REMOVE_DIALOG_H
