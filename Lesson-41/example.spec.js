// @ts-check
const { test, expect } = require('@playwright/test');

test('has title', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Expect a title "to contain" a substring.
  await expect(page).toHaveTitle(/Playwright/);
});

test('get started link', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Click the get started link.
  await page.getByRole('link', { name: 'Get started' }).click();

  // Expects the URL to contain intro.
  await expect(page).toHaveURL(/.*intro/);
});

test('codegen demo', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // создать локатор для кнопки Get started
  const getStarted = page.getByRole('link', { name: 'Get started' });
  await getStarted.click();
  await expect(page).toHaveURL(/.*intro/);

  await page.getByRole('button', { name: 'Node.js' }).click();
  await page.getByRole('link', { name: 'Java', exact: true }).click();
  await page.getByRole('link', { name: 'Writing tests', exact: true }).click();
  await page.getByRole('link', { name: 'Actions' }).click();
  const page1Promise = page.waitForEvent('popup');
  await page.getByRole('link', { name: 'GitHub repository' }).click();
  const page1 = await page1Promise;
  await page.getByRole('link', { name: 'API', exact: true }).click();
  await page.getByRole('link', { name: 'Community' }).click();
  await page.getByRole('link', { name: 'Conference Videos' }).click();
});

test('test', async ({ page }) => {
  
  await page.goto('https://stc.innopolis.university/');
  await page.getByRole('menuitem', { name: 'Курсы' }).click();
  await page.getByRole('tab', { name: 'Тестирование' }).click();
  const page1Promise = page.waitForEvent('popup');
  await page.getByRole('link', { name: 'Подробнее о курсе' }).nth(2).click();
  const page1 = await page1Promise;
  await page1.getByRole('link', { name: 'Записаться' }).click();
  await page1.getByPlaceholder('ФИО').click();
  await page1.locator('#input_1495722666746').fill('Тарасов Антон Александрович');
  await page1.locator('#form602359190 div').filter({ hasText: /^\+7$/ }).first().click();
  await page1.locator('#form602359190').getByText('Albania (Shqipëri)').click();
  await page1.locator('#form602359190 input[name="tildaspec-phone-part\\[\\]"]').fill('(325) 235-232');
  await page1.getByPlaceholder('E-mail', { exact: true }).click();
  await page1.locator('#input_1495722502842').fill('respawn91@gmail.com');
});

test('basic tests', async ({ page }) => {
    
  // Идем на сайт УИ
  await page.goto('https://stc.innopolis.university/');

  // Проверяем заголовок страницы
  await expect(page).toHaveTitle(/ИТ-курсы в Университете Иннополис: повышение квалификации и подготовка кадров для ИТ-компаний/);
  
  // Создаем локатор для "Курсов"
  const courses = page.getByRole('menuitem', {name: 'Курсы'});

  // Кликаем по локатору
  await courses.click();

  // Проверяем URL
  await expect(page).toHaveURL(/.#rec281327586/);

  // Создаем локатор для "Школьников"
  const schoolmates = page.getByRole('tab', {name: 'Школьникам'});

  // Кликаем по локатору
  await schoolmates.click();

  await page.getByRole('button', { name: 'Не могу выбрать курс, нужна помощь' }).click();
  await page.getByText('Нужна консультация!Связаться с менеджером +7Afghanistan (افغانستان)+93Albania (S').click();
  await page.getByLabel('Ваше имя*').click();
  await page.getByLabel('Ваше имя*').fill('test@domain.com');
  await page.getByLabel('Ваше имя*').press('Tab');
  await page.getByLabel('Номер телефона*').fill('Anton');
  await page.getByRole('dialog', { name: 'Нужна консультация!' }).getByPlaceholder('(999) 999-99-99').click();
  await page.getByRole('dialog', { name: 'Нужна консультация!' }).locator('input[name="tildaspec-phone-part\\[\\]"]').click();
  await page.getByRole('dialog', { name: 'Нужна консультация!' }).locator('input[name="tildaspec-phone-part\\[\\]"]').fill('(999) 999-99-99');

});