#include "remove_dialog.h"
#include "ui_remove_dialog.h"

RemoveDialog::RemoveDialog(Database &database, QWidget *parent) :
    QDialog(parent),
    database(database),
    ui(new Ui::RemoveDialog)
{
    ui->setupUi(this);
}

RemoveDialog::~RemoveDialog()
{
    delete ui;
}

void RemoveDialog::on_buttonBox_accepted()
{
    int toRemove = ui->lineEdit->text().toInt();
    database.remove(toRemove);
}

