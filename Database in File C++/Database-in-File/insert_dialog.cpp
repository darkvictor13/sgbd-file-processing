#include "insert_dialog.h"
#include "ui_insert_dialog.h"

InsertDialog::InsertDialog(Database &database, Student student, QWidget *parent, int id) :
    QDialog(parent),
    database(database),
    student(student),
    id(id),
    ui(new Ui::InsertDialog)
{
    ui->setupUi(this);

    this->student = student;

    ui->firstNameLineEdit->setText(QString::fromStdString(this->student.first_name));
    ui->lastNameLineEdit->setText(QString::fromStdString(this->student.last_name));
    ui->documentTypeLineEdit->setText(QString::fromStdString(this->student.document_type));
    ui->documentLineEdit->setText(QString::fromStdString(this->student.document));
    ui->phoneLineEdit->setText(QString::fromStdString(this->student.phone));
    ui->emailLineEdit->setText(QString::fromStdString(this->student.email));
    ui->cityLineEdit->setText(QString::fromStdString(this->student.city));
}

InsertDialog::~InsertDialog()
{
    delete ui;
}

void InsertDialog::on_buttonBox_accepted()
{
    student.first_name = ui->firstNameLineEdit->text().toStdString();
    student.last_name = ui->lastNameLineEdit->text().toStdString();
    student.document_type = ui->documentTypeLineEdit->text().toStdString();
    student.document = ui->documentLineEdit->text().toStdString();
    student.phone = ui->phoneLineEdit->text().toStdString();
    student.email = ui->emailLineEdit->text().toStdString();
    student.city = ui->cityLineEdit->text().toStdString();
    database.addData(student, id);
}

