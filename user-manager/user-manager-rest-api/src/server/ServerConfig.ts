import { Middleware } from 'koa';
import { Router } from '../utils/Router';
import { Logger } from '../config/logger';
import { DatabaseConfig } from '../database';
import { RoutesInjectionParams } from '../routes/RoutesInjectionParams';

export interface ServerConfig {
  databaseConfig: DatabaseConfig;
  logger: Logger;
  middlewares: Middleware[];
  port: number;
  routersFactory: (injectionParams: RoutesInjectionParams) => Router[];
}
