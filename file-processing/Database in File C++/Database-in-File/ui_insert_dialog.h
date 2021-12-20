/********************************************************************************
** Form generated from reading UI file 'insert_dialog.ui'
**
** Created by: Qt User Interface Compiler version 5.15.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_INSERT_DIALOG_H
#define UI_INSERT_DIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QDialog>
#include <QtWidgets/QDialogButtonBox>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QVBoxLayout>

QT_BEGIN_NAMESPACE

class Ui_InsertDialog
{
public:
    QGridLayout *gridLayout;
    QVBoxLayout *verticalLayout;
    QHBoxLayout *firstNameHorizontalLayout;
    QLabel *firstnameLabel;
    QLineEdit *firstNameLineEdit;
    QHBoxLayout *lastNameHorizontalLayout;
    QLabel *lastNameLabel;
    QLineEdit *lastNameLineEdit;
    QHBoxLayout *documentTypeHorizontalLayout;
    QLabel *documentTypeLabel;
    QLineEdit *documentTypeLineEdit;
    QHBoxLayout *documentHorizontalLayout;
    QLabel *documentLabel;
    QLineEdit *documentLineEdit;
    QHBoxLayout *phoneHorizontalLayout;
    QLabel *phoneLabel;
    QLineEdit *phoneLineEdit;
    QHBoxLayout *emailHorizontalLayout;
    QLabel *emailLabel;
    QLineEdit *emailLineEdit;
    QHBoxLayout *cityHorizontalLayout;
    QLabel *cityLabel;
    QLineEdit *cityLineEdit;
    QDialogButtonBox *buttonBox;
    QLabel *label;

    void setupUi(QDialog *InsertDialog)
    {
        if (InsertDialog->objectName().isEmpty())
            InsertDialog->setObjectName(QString::fromUtf8("InsertDialog"));
        InsertDialog->resize(400, 300);
        gridLayout = new QGridLayout(InsertDialog);
        gridLayout->setObjectName(QString::fromUtf8("gridLayout"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        firstNameHorizontalLayout = new QHBoxLayout();
        firstNameHorizontalLayout->setObjectName(QString::fromUtf8("firstNameHorizontalLayout"));
        firstNameHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        firstnameLabel = new QLabel(InsertDialog);
        firstnameLabel->setObjectName(QString::fromUtf8("firstnameLabel"));
        firstnameLabel->setAlignment(Qt::AlignCenter);

        firstNameHorizontalLayout->addWidget(firstnameLabel);

        firstNameLineEdit = new QLineEdit(InsertDialog);
        firstNameLineEdit->setObjectName(QString::fromUtf8("firstNameLineEdit"));

        firstNameHorizontalLayout->addWidget(firstNameLineEdit);

        firstNameHorizontalLayout->setStretch(0, 1);
        firstNameHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(firstNameHorizontalLayout);

        lastNameHorizontalLayout = new QHBoxLayout();
        lastNameHorizontalLayout->setObjectName(QString::fromUtf8("lastNameHorizontalLayout"));
        lastNameHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        lastNameLabel = new QLabel(InsertDialog);
        lastNameLabel->setObjectName(QString::fromUtf8("lastNameLabel"));
        lastNameLabel->setAlignment(Qt::AlignCenter);

        lastNameHorizontalLayout->addWidget(lastNameLabel);

        lastNameLineEdit = new QLineEdit(InsertDialog);
        lastNameLineEdit->setObjectName(QString::fromUtf8("lastNameLineEdit"));

        lastNameHorizontalLayout->addWidget(lastNameLineEdit);

        lastNameHorizontalLayout->setStretch(0, 1);
        lastNameHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(lastNameHorizontalLayout);

        documentTypeHorizontalLayout = new QHBoxLayout();
        documentTypeHorizontalLayout->setObjectName(QString::fromUtf8("documentTypeHorizontalLayout"));
        documentTypeHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        documentTypeLabel = new QLabel(InsertDialog);
        documentTypeLabel->setObjectName(QString::fromUtf8("documentTypeLabel"));
        documentTypeLabel->setAlignment(Qt::AlignCenter);

        documentTypeHorizontalLayout->addWidget(documentTypeLabel);

        documentTypeLineEdit = new QLineEdit(InsertDialog);
        documentTypeLineEdit->setObjectName(QString::fromUtf8("documentTypeLineEdit"));

        documentTypeHorizontalLayout->addWidget(documentTypeLineEdit);

        documentTypeHorizontalLayout->setStretch(0, 1);
        documentTypeHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(documentTypeHorizontalLayout);

        documentHorizontalLayout = new QHBoxLayout();
        documentHorizontalLayout->setObjectName(QString::fromUtf8("documentHorizontalLayout"));
        documentHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        documentLabel = new QLabel(InsertDialog);
        documentLabel->setObjectName(QString::fromUtf8("documentLabel"));
        documentLabel->setAlignment(Qt::AlignCenter);

        documentHorizontalLayout->addWidget(documentLabel);

        documentLineEdit = new QLineEdit(InsertDialog);
        documentLineEdit->setObjectName(QString::fromUtf8("documentLineEdit"));

        documentHorizontalLayout->addWidget(documentLineEdit);

        documentHorizontalLayout->setStretch(0, 1);
        documentHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(documentHorizontalLayout);

        phoneHorizontalLayout = new QHBoxLayout();
        phoneHorizontalLayout->setObjectName(QString::fromUtf8("phoneHorizontalLayout"));
        phoneHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        phoneLabel = new QLabel(InsertDialog);
        phoneLabel->setObjectName(QString::fromUtf8("phoneLabel"));
        phoneLabel->setAlignment(Qt::AlignCenter);

        phoneHorizontalLayout->addWidget(phoneLabel);

        phoneLineEdit = new QLineEdit(InsertDialog);
        phoneLineEdit->setObjectName(QString::fromUtf8("phoneLineEdit"));

        phoneHorizontalLayout->addWidget(phoneLineEdit);

        phoneHorizontalLayout->setStretch(0, 1);
        phoneHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(phoneHorizontalLayout);

        emailHorizontalLayout = new QHBoxLayout();
        emailHorizontalLayout->setObjectName(QString::fromUtf8("emailHorizontalLayout"));
        emailHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        emailLabel = new QLabel(InsertDialog);
        emailLabel->setObjectName(QString::fromUtf8("emailLabel"));
        emailLabel->setAlignment(Qt::AlignCenter);

        emailHorizontalLayout->addWidget(emailLabel);

        emailLineEdit = new QLineEdit(InsertDialog);
        emailLineEdit->setObjectName(QString::fromUtf8("emailLineEdit"));

        emailHorizontalLayout->addWidget(emailLineEdit);

        emailHorizontalLayout->setStretch(0, 1);
        emailHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(emailHorizontalLayout);

        cityHorizontalLayout = new QHBoxLayout();
        cityHorizontalLayout->setObjectName(QString::fromUtf8("cityHorizontalLayout"));
        cityHorizontalLayout->setContentsMargins(9, -1, 9, -1);
        cityLabel = new QLabel(InsertDialog);
        cityLabel->setObjectName(QString::fromUtf8("cityLabel"));
        cityLabel->setAlignment(Qt::AlignCenter);

        cityHorizontalLayout->addWidget(cityLabel);

        cityLineEdit = new QLineEdit(InsertDialog);
        cityLineEdit->setObjectName(QString::fromUtf8("cityLineEdit"));

        cityHorizontalLayout->addWidget(cityLineEdit);

        cityHorizontalLayout->setStretch(0, 1);
        cityHorizontalLayout->setStretch(1, 2);

        verticalLayout->addLayout(cityHorizontalLayout);


        gridLayout->addLayout(verticalLayout, 1, 0, 1, 1);

        buttonBox = new QDialogButtonBox(InsertDialog);
        buttonBox->setObjectName(QString::fromUtf8("buttonBox"));
        buttonBox->setOrientation(Qt::Horizontal);
        buttonBox->setStandardButtons(QDialogButtonBox::Cancel|QDialogButtonBox::Ok);

        gridLayout->addWidget(buttonBox, 2, 0, 1, 1);

        label = new QLabel(InsertDialog);
        label->setObjectName(QString::fromUtf8("label"));
        QFont font;
        font.setPointSize(12);
        font.setBold(true);
        label->setFont(font);
        label->setAlignment(Qt::AlignCenter);

        gridLayout->addWidget(label, 0, 0, 1, 1);


        retranslateUi(InsertDialog);
        QObject::connect(buttonBox, SIGNAL(accepted()), InsertDialog, SLOT(accept()));
        QObject::connect(buttonBox, SIGNAL(rejected()), InsertDialog, SLOT(reject()));

        QMetaObject::connectSlotsByName(InsertDialog);
    } // setupUi

    void retranslateUi(QDialog *InsertDialog)
    {
        InsertDialog->setWindowTitle(QCoreApplication::translate("InsertDialog", "Dialog", nullptr));
        firstnameLabel->setText(QCoreApplication::translate("InsertDialog", "Nome", nullptr));
        lastNameLabel->setText(QCoreApplication::translate("InsertDialog", "Sobrenome", nullptr));
        documentTypeLabel->setText(QCoreApplication::translate("InsertDialog", "Tipo de documento", nullptr));
        documentLabel->setText(QCoreApplication::translate("InsertDialog", "Documento", nullptr));
        phoneLabel->setText(QCoreApplication::translate("InsertDialog", "Telefone", nullptr));
        emailLabel->setText(QCoreApplication::translate("InsertDialog", "Email", nullptr));
        cityLabel->setText(QCoreApplication::translate("InsertDialog", "Cidade", nullptr));
        label->setText(QCoreApplication::translate("InsertDialog", "Inserir", nullptr));
    } // retranslateUi

};

namespace Ui {
    class InsertDialog: public Ui_InsertDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_INSERT_DIALOG_H
