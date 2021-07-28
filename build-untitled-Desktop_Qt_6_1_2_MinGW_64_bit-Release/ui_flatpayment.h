/********************************************************************************
** Form generated from reading UI file 'flatpayment.ui'
**
** Created by: Qt User Interface Compiler version 6.1.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_FLATPAYMENT_H
#define UI_FLATPAYMENT_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_FlatPayment
{
public:
    QWidget *centralwidget;
    QWidget *widget;
    QVBoxLayout *verticalLayout_2;
    QVBoxLayout *verticalLayout;
    QGridLayout *gridLayout;
    QLineEdit *tarifCold;
    QPushButton *pushButton;
    QLineEdit *tarifElectro;
    QLabel *label_11;
    QLabel *label_4;
    QLineEdit *newCold;
    QLineEdit *payElectro;
    QLabel *label_6;
    QLineEdit *oldElectro;
    QLineEdit *payOtved;
    QLabel *label_10;
    QLineEdit *edElectro;
    QLabel *label_8;
    QLabel *label_3;
    QLineEdit *paySum;
    QLineEdit *edHot;
    QLineEdit *tarifOtved;
    QLineEdit *edCold;
    QLineEdit *oldCold;
    QLineEdit *tarifArenda;
    QLabel *label_9;
    QLineEdit *newElectro;
    QLineEdit *newHot;
    QLineEdit *oldHot;
    QLineEdit *tarifHot;
    QLineEdit *payCold;
    QLabel *label_5;
    QLabel *label;
    QLineEdit *payHot;
    QLabel *label_2;
    QLineEdit *edOtved;
    QLabel *label_7;
    QPushButton *pushButton_2;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *FlatPayment)
    {
        if (FlatPayment->objectName().isEmpty())
            FlatPayment->setObjectName(QString::fromUtf8("FlatPayment"));
        FlatPayment->resize(812, 264);
        centralwidget = new QWidget(FlatPayment);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        widget = new QWidget(centralwidget);
        widget->setObjectName(QString::fromUtf8("widget"));
        widget->setGeometry(QRect(10, 10, 791, 211));
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        gridLayout = new QGridLayout();
        gridLayout->setObjectName(QString::fromUtf8("gridLayout"));
        tarifCold = new QLineEdit(widget);
        tarifCold->setObjectName(QString::fromUtf8("tarifCold"));
        tarifCold->setEnabled(true);

        gridLayout->addWidget(tarifCold, 3, 1, 1, 2);

        pushButton = new QPushButton(widget);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));

        gridLayout->addWidget(pushButton, 5, 3, 1, 2);

        tarifElectro = new QLineEdit(widget);
        tarifElectro->setObjectName(QString::fromUtf8("tarifElectro"));
        tarifElectro->setEnabled(true);

        gridLayout->addWidget(tarifElectro, 1, 1, 1, 2);

        label_11 = new QLabel(widget);
        label_11->setObjectName(QString::fromUtf8("label_11"));

        gridLayout->addWidget(label_11, 5, 5, 1, 1, Qt::AlignRight);

        label_4 = new QLabel(widget);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        gridLayout->addWidget(label_4, 4, 0, 1, 1);

        newCold = new QLineEdit(widget);
        newCold->setObjectName(QString::fromUtf8("newCold"));

        gridLayout->addWidget(newCold, 3, 4, 1, 1);

        payElectro = new QLineEdit(widget);
        payElectro->setObjectName(QString::fromUtf8("payElectro"));

        gridLayout->addWidget(payElectro, 1, 6, 1, 1);

        label_6 = new QLabel(widget);
        label_6->setObjectName(QString::fromUtf8("label_6"));

        gridLayout->addWidget(label_6, 0, 1, 1, 1);

        oldElectro = new QLineEdit(widget);
        oldElectro->setObjectName(QString::fromUtf8("oldElectro"));

        gridLayout->addWidget(oldElectro, 1, 3, 1, 1);

        payOtved = new QLineEdit(widget);
        payOtved->setObjectName(QString::fromUtf8("payOtved"));

        gridLayout->addWidget(payOtved, 4, 6, 1, 1);

        label_10 = new QLabel(widget);
        label_10->setObjectName(QString::fromUtf8("label_10"));

        gridLayout->addWidget(label_10, 0, 6, 1, 1);

        edElectro = new QLineEdit(widget);
        edElectro->setObjectName(QString::fromUtf8("edElectro"));

        gridLayout->addWidget(edElectro, 1, 5, 1, 1);

        label_8 = new QLabel(widget);
        label_8->setObjectName(QString::fromUtf8("label_8"));

        gridLayout->addWidget(label_8, 0, 4, 1, 1);

        label_3 = new QLabel(widget);
        label_3->setObjectName(QString::fromUtf8("label_3"));

        gridLayout->addWidget(label_3, 3, 0, 1, 1);

        paySum = new QLineEdit(widget);
        paySum->setObjectName(QString::fromUtf8("paySum"));

        gridLayout->addWidget(paySum, 5, 6, 1, 1);

        edHot = new QLineEdit(widget);
        edHot->setObjectName(QString::fromUtf8("edHot"));

        gridLayout->addWidget(edHot, 2, 5, 1, 1);

        tarifOtved = new QLineEdit(widget);
        tarifOtved->setObjectName(QString::fromUtf8("tarifOtved"));

        gridLayout->addWidget(tarifOtved, 4, 1, 1, 2);

        edCold = new QLineEdit(widget);
        edCold->setObjectName(QString::fromUtf8("edCold"));

        gridLayout->addWidget(edCold, 3, 5, 1, 1);

        oldCold = new QLineEdit(widget);
        oldCold->setObjectName(QString::fromUtf8("oldCold"));

        gridLayout->addWidget(oldCold, 3, 3, 1, 1);

        tarifArenda = new QLineEdit(widget);
        tarifArenda->setObjectName(QString::fromUtf8("tarifArenda"));

        gridLayout->addWidget(tarifArenda, 5, 1, 1, 2);

        label_9 = new QLabel(widget);
        label_9->setObjectName(QString::fromUtf8("label_9"));

        gridLayout->addWidget(label_9, 0, 5, 1, 1);

        newElectro = new QLineEdit(widget);
        newElectro->setObjectName(QString::fromUtf8("newElectro"));

        gridLayout->addWidget(newElectro, 1, 4, 1, 1);

        newHot = new QLineEdit(widget);
        newHot->setObjectName(QString::fromUtf8("newHot"));

        gridLayout->addWidget(newHot, 2, 4, 1, 1);

        oldHot = new QLineEdit(widget);
        oldHot->setObjectName(QString::fromUtf8("oldHot"));

        gridLayout->addWidget(oldHot, 2, 3, 1, 1);

        tarifHot = new QLineEdit(widget);
        tarifHot->setObjectName(QString::fromUtf8("tarifHot"));
        tarifHot->setEnabled(true);

        gridLayout->addWidget(tarifHot, 2, 1, 1, 2);

        payCold = new QLineEdit(widget);
        payCold->setObjectName(QString::fromUtf8("payCold"));

        gridLayout->addWidget(payCold, 3, 6, 1, 1);

        label_5 = new QLabel(widget);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        gridLayout->addWidget(label_5, 5, 0, 1, 1);

        label = new QLabel(widget);
        label->setObjectName(QString::fromUtf8("label"));

        gridLayout->addWidget(label, 1, 0, 1, 1);

        payHot = new QLineEdit(widget);
        payHot->setObjectName(QString::fromUtf8("payHot"));

        gridLayout->addWidget(payHot, 2, 6, 1, 1);

        label_2 = new QLabel(widget);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        gridLayout->addWidget(label_2, 2, 0, 1, 1);

        edOtved = new QLineEdit(widget);
        edOtved->setObjectName(QString::fromUtf8("edOtved"));

        gridLayout->addWidget(edOtved, 4, 5, 1, 1);

        label_7 = new QLabel(widget);
        label_7->setObjectName(QString::fromUtf8("label_7"));

        gridLayout->addWidget(label_7, 0, 3, 1, 1);


        verticalLayout->addLayout(gridLayout);


        verticalLayout_2->addLayout(verticalLayout);

        pushButton_2 = new QPushButton(widget);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));

        verticalLayout_2->addWidget(pushButton_2);

        FlatPayment->setCentralWidget(centralwidget);
        menubar = new QMenuBar(FlatPayment);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 812, 20));
        FlatPayment->setMenuBar(menubar);
        statusbar = new QStatusBar(FlatPayment);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        FlatPayment->setStatusBar(statusbar);

        retranslateUi(FlatPayment);

        QMetaObject::connectSlotsByName(FlatPayment);
    } // setupUi

    void retranslateUi(QMainWindow *FlatPayment)
    {
        FlatPayment->setWindowTitle(QCoreApplication::translate("FlatPayment", "FlatPayment", nullptr));
        tarifCold->setText(QCoreApplication::translate("FlatPayment", "27.64", nullptr));
        pushButton->setText(QCoreApplication::translate("FlatPayment", "\320\237\320\276\320\274\320\265\320\275\321\217\321\202\321\214 \320\274\320\265\321\201\321\202\320\260\320\274\320\270 \320\277\321\200\320\265\320\264. \320\270 \320\275\321\213\320\275\320\265\321\210\320\275\320\270\320\265 \320\277\320\276\320\272\320\260\320\267\320\260\320\275\320\270\321\217", nullptr));
        tarifElectro->setText(QCoreApplication::translate("FlatPayment", "4.29", nullptr));
        label_11->setText(QCoreApplication::translate("FlatPayment", "\320\241\321\203\320\274\320\274\320\260:", nullptr));
        label_4->setText(QCoreApplication::translate("FlatPayment", "\320\222\320\276\320\264\320\276\320\276\321\202\320\262\320\265\320\264\320\265\320\275\320\270\320\265", nullptr));
        label_6->setText(QCoreApplication::translate("FlatPayment", "\320\242\320\260\321\200\320\270\321\204", nullptr));
        label_10->setText(QCoreApplication::translate("FlatPayment", "\320\232 \320\276\320\277\320\273\320\260\321\202\320\265, \321\200\321\203\320\261.", nullptr));
        label_8->setText(QCoreApplication::translate("FlatPayment", "\320\235\321\213\320\275\320\265\321\210\320\275\320\270\320\265 \320\277\320\276\320\272\320\260\320\267\320\260\320\275\320\270\321\217", nullptr));
        label_3->setText(QCoreApplication::translate("FlatPayment", "\320\245\320\276\320\273. \320\262\320\276\320\264\320\260", nullptr));
        tarifOtved->setText(QCoreApplication::translate("FlatPayment", "24.84", nullptr));
        tarifArenda->setText(QCoreApplication::translate("FlatPayment", "24000", nullptr));
        label_9->setText(QCoreApplication::translate("FlatPayment", "\320\232 \320\276\320\277\320\273\320\260\321\202\320\265, \320\265\320\264.", nullptr));
        tarifHot->setText(QCoreApplication::translate("FlatPayment", "184.58", nullptr));
        label_5->setText(QCoreApplication::translate("FlatPayment", "\320\220\321\200\320\265\320\275\320\264\320\260", nullptr));
        label->setText(QCoreApplication::translate("FlatPayment", "\320\255\320\273\320\265\320\272\321\202\321\200\320\276\321\215\320\275\320\265\321\200\320\263\320\270\321\217", nullptr));
        label_2->setText(QCoreApplication::translate("FlatPayment", "\320\223\320\276\321\200. \320\262\320\276\320\264\320\260", nullptr));
        label_7->setText(QCoreApplication::translate("FlatPayment", "\320\237\321\200\320\265\320\264\321\213\320\264\321\203\321\211\320\270\320\265 \320\277\320\276\320\272\320\260\320\267\320\260\320\275\320\270\321\217", nullptr));
        pushButton_2->setText(QCoreApplication::translate("FlatPayment", "\320\240\320\260\321\201\321\201\321\207\321\221\321\202", nullptr));
    } // retranslateUi

};

namespace Ui {
    class FlatPayment: public Ui_FlatPayment {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_FLATPAYMENT_H
