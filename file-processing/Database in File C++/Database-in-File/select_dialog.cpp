#include "select_dialog.h"
#include "ui_select_dialog.h"

SelectDialog::SelectDialog(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::SelectDialog)
{
    ui->setupUi(this);
}

SelectDialog::~SelectDialog()
{
    delete ui;
}

void SelectDialog::on_buttonBox_accepted()
{
    id = ui->lineEdit->text();
}

